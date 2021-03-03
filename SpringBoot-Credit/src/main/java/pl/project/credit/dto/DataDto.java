package pl.project.credit.dto;

import lombok.*;
import pl.project.credit.model.Credit;
import pl.project.credit.model.Customer;
import pl.project.credit.model.Product;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class DataDto {
    private Credit credit;
    private Customer customer;
    private Product product;
}
