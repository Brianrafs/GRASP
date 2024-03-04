# Sistema de Gerenciamento de Locação de Veículos

Este é um sistema desenvolvido em Java para gerenciar a locação de veículos em uma empresa. Ele permite registrar diferentes tipos de veículos, calcular o valor da diária de cada veículo e realizar algumas operações de consulta.

## Funcionalidades

1. **Valor da diária de um determinado veículo**: Calcula o valor da diária de um veículo específico com base em sua identificação.
2. **Quantidade de veículos cadastrados**: Retorna a quantidade total de veículos cadastrados no sistema.
3. **Veículos cadastrados de determinado tipo, em ordem alfabética da identificação**: Lista os veículos de um tipo específico em ordem alfabética de suas identificações.
4. **Veículo com diária mais cara**: Identifica o veículo com o valor de diária mais alto.

## Tipos de Veículos Suportados

- Avião
- Carro
- Helicóptero
- Moto
- Ônibus

## Cálculo da Diária

Cada tipo de veículo possui um método específico para calcular o valor da diária:

- **Avião**: 20% do valor de compra + 1000 * velocidade de cruzeiro
- **Carro**: 2% do valor de compra
- **Helicóptero**: 10% do valor de compra * quantidade de rotores
- **Moto**: 2% do valor de compra + sistema de partida (elétrico: R$ 20,00, manual: R$ 5,00)
- **Ônibus**: 4% do valor de compra + 100 * quantidade de passageiros

## Adição de Novos Veículos

O sistema foi implementado de forma a permitir o acréscimo de novos tipos de veículos com o menor esforço possível. Novos tipos de veículos podem ser adicionados estendendo a classe `Vehicle` e implementando o método `calculateDailyPrice()` de acordo com o cálculo específico do tipo de veículo.

## Tratamento de Erros

Os erros do sistema são tratados como exceções para garantir um funcionamento adequado e seguro.
