# Documentação de componentes

### 1. Tensão e corrente de operação

    1.1 Módulo de coleta de dados (Transmissão)
    
	    Esta partição do projeto será composta pelos seguintes 
	    componentes: Arduino uno, módulo de transmissao rádio/
	    wifi modelo NRF24L01 e sensor de temperatura e umidade 
	    relativa do ar modelo DHT11. A tabela 1 demonstra os va-
	    lores recomendados pelo fabricante para o bom funciona-
	    mento dos dispostivos.

		| Componente | Fabricante | Tensão | Corrente |
		| ------ | ------ | ----- | ----- |
		| NRF24L01 [1] | Nordic | 1.9 - 3.6V | 11.3 mA | 
		| DHT11 [2] | Aosong | 3.5 - 5.5V| 0.3 mA |
		
