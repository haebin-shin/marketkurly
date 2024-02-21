<template>

    <v-data-table
        :headers="headers"
        :items="productlist"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'ProductlistView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            productlist : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/productlists'))

            temp.data._embedded.productlists.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.productlist = temp.data._embedded.productlists;
        },
        methods: {
        }
    }
</script>

