package br.com.db1.db1start.bancoapi.dto;

public class ContaInputDTO {
	
	private Double saldo;
	private AgenciaInputDTO agenciaDTO;
	private ClienteInputDTO clienteDTO;
	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public AgenciaInputDTO getAgenciaDTO() {
		return agenciaDTO;
	}
	public void setAgenciaDTO(AgenciaInputDTO agenciaDTO) {
		this.agenciaDTO = agenciaDTO;
	}
	public ClienteInputDTO getClienteDTO() {
		return clienteDTO;
	}
	public void setClienteDTO(ClienteInputDTO clienteDTO) {
		this.clienteDTO = clienteDTO;
	}


	
}
