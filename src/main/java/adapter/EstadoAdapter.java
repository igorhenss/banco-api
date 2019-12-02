package adapter;

import br.com.db1.db1start.bancoapi.entity.Estado;
import dto.EstadoDTO;

public class EstadoAdapter {

	public static EstadoDTO transformaEntidadeParaDTO(Estado estado) {
		EstadoDTO dto =  new EstadoDTO();
		dto.setId(estado.getId());
		dto.setNome(estado.getNome());
		return dto;
	}
}
