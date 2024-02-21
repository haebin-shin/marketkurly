package marketkurly.infra;

import java.util.List;
import marketkurly.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "productlists",
    path = "productlists"
)
public interface ProductlistRepository
    extends PagingAndSortingRepository<Productlist, Long> {}
