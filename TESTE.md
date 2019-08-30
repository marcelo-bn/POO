# Documentação de componentes

### 1. Tensão e corrente de operação

1.1 Módulo de coleta de dados (Transmissão)
    
Esta partição do projeto será composta pelos seguintes componentes: Arduino uno, módulo de transmissão rádio/wifi modelo NRF24L01 e sensor de temperatura e umidade relativa do ar modelo DHT11. O sensor DHT11 irá realizar a coleta de dados e por intermédio do microprocessador Arduino Uno, o módulo de rádio/wifi irá enviá-los à estação base (módulo de recepção).

A tabela 1 demonstra os valores recomendados pelo fabricante para o bom funcionamento dos dispositivos. Vale lembrar que o projeto será dependente de uma rede elétrica próxima às estações (remota e base) para a alimentação dos componentes, para isto, é necessário uma fonte externa que fará a alimentação correta do microcontrolador. Essa fonte deverá ser capaz de fornecer entre 5 - 12V e 0.5 - 1A para o funcionamento eficaz do componente. Uma outra observação é em relação a tensão da rede local, cabe ao usuário verificar se a fonte externa é compatível com a mesma, caso contrário será necessário o uso de transformador para a conversão de tensão adequada. A fonte externa utilizada no desenvolvimento do projeto também está especificada na tabela 1.

| Componente | Fabricante | Tensão | Corrente |
| ------ | ------ | ----- | ----- |
| NRF24L01 [1] | Nordic | 1.9 - 3.6V | 11.3 mA | 
| DHT11 [2] | Aosong | 3.5 - 5.5V| 0.3 mA |
| Arduino Uno [3] | Atmel | 1.8 - 5.5V| máx: 500 mA|
| Fonte externa | - | 6.4V | 750 mA |

Tabela 1 - Especificações de componentes da estação remota


1.2 Módulo de recepção de dados 



[1] https://4donline.ihs.com/images/VipMasterIC/IC/NRSA/NRSAS00020/NRSAS00020-1.pdf?hkey=52A5661711E402568146F3353EA87419

[2]https://img.filipeflop.com/files/download/Datasheet_DHT11.pdf

[3]https://pdf1.alldatasheet.com/datasheet-pdf/view/241077/ATMEL/ATMEGA328P.html
		
