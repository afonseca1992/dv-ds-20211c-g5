package ar.edu.davinci.dvds20211cg5.controller.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemInsertRequest {

	private Integer cantidad;

	private Long prendaId;

}

