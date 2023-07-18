- A classe "Veicluo" é "abstract" porque nao sabemmos que tipo de veiculo ele irá ligar(carro ou moto);
- O metodo "ligar" é "abstract" porque cada um dos veiculos possui uma forma de ser ligado.

    No caso do uso do "abstract" é ncessário criar o metodo "ligar" tanto na moto quanto no carro para que ambos possam
aderir a classe "ligar" do metodo "Veiculo".

                        Assim temos uma única finalidade com comportamentos diferentes!