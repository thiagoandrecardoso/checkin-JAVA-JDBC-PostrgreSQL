# Versão 1.0.0 (09/10/2021)

## Projeto CheckIn

### Tecnoligias:

* Java 16
* JDBC
* IntelliJ
* PostgreSQL

### Driver:

- postgresql-4.2.2.24 [Baixar](https://jdbc.postgresql.org/download.html)

### Fluxo principal:

- [X] O sistema exibe a tela inicial uma opção "realizar cheking";
- [X] O usuário seleciona a opção "realizar cheking" no sistema;
- [X] O sistema solicita o código localizador do bilhete;
- [x] O usuário informa o código localizador e seleciona "próximo";
- [x] O sistema locazila o bilhete;
- [X] 0 sistema exibe as informações do bilhete, como origem, destino, hora prevista do embarque, hora prevista da
  partida, a hora do relógio da parede (para o usuário se planejar); as informações do passageiro, que no caso, são nome
  e cpf; e as opções:
  "atualizar dados pessoais" e "próximo";
- [X] O usuário seleciona próximo;
- [X] O sistema exibe uma tela para marcação de assento da linha em questão posicionadas de acordo com o tipo de veículo
  que efetuará a passagem e indicando visualmente os assentos disponíveis e os não disponíveis para a marcação;
- [X] O usuário seleciona o seu assento e seleciona "próximo";
- [X] O sistema marca o assento para esse localizador do bilhete;
- [X] O sistema exibe a mensagem "Cheking realizado com sucesso";
- [X] O sistema volta para a tela inicial.

### Alguns código de bilhete para teste

- AFOXLC
- LEJUMN
- EADKKP
- HLOKPG
- KQRVGO
- QBUVEY