package br.com.blz.testjava.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.lang.NonNull;

@Data
@ToString
@NoArgsConstructor
public class ProductDTO {
    @NonNull
    private Integer sku;
    @NonNull
    private String name;
    @NonNull
    private InventoryDTO inventory;
}
