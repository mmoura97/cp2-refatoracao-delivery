# FiapDelivery - Refatoração POO

Este repositório contém a entrega do Check Point 2 da disciplina de Programação Orientada a Objetos, focado em corrigir falhas arquitetônicas de um sistema legado aplicando boas práticas de Engenharia de Software.

## 🛠️ O que foi refatorado?

Para blindar o sistema e garantir sua escalabilidade, as seguintes técnicas foram implementadas:

* **Herança (Generalização):** Criação da superclasse `Veiculo` para eliminar a duplicação de atributos (`placa` e `capacidade`) nas subclasses `Caminhao` e `Moto`.
* **Associação Dinâmica:** A classe `Rota` foi refatorada para receber a superclasse `Veiculo` em vez de aceitar apenas caminhões. Isso corrigiu o "engessamento" do sistema, permitindo que entregas sejam feitas por qualquer tipo de veículo.
* **Encapsulamento e Construtores:** Todos os atributos públicos foram convertidos para `private`. As classes agora exigem a passagem de dados obrigatórios através de seus métodos construtores, impedindo o nascimento de objetos inválidos (ex: com capacidades negativas).
* **Clean Code:** As variáveis com nomes sem sentido (`p`, `pl`, `s`, `x`) foram substituídas por nomes baseados em seus papéis dentro da regra de negócio (`peso`, `placa`, `status`, `veiculoDesignado`).

## 📁 Estrutura do Projeto

* `src/br/com/fiapdelivery/model/`: Classes de domínio com as regras de negócio.
* `src/br/com/fiapdelivery/main/`: Classe principal para execução e testes.
* `Diagrama de Classes.png`: O diagrama UML exportado documentando a nova arquitetura do sistema.