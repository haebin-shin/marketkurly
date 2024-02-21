<template>

    <v-data-table
        :headers="headers"
        :items="orderlist"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'OrderlistView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            orderlist : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/orderlists'))

            temp.data._embedded.orderlists.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.orderlist = temp.data._embedded.orderlists;
        },
        methods: {
        }
    }
</script>

