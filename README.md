Os últimos commits configuraram o banco de dados h2, que é um banquinho em memória só pra desenvolvimento, tipo o SQLite no Django.

O SGBD pode ser acessado através do endereço `http://localhost:8080/h2-console/` após rodar a aplicação.

Além disso, existe um arquivo chamado `data.sql`, que executa alguns comandos SQL toda vez que a aplicação roda.

Importante destacar que foi feito também um mapeamento entre esse arquivo e o model `Produto.java`, usando algumas anotações.

Ainda não existe persistência, mas também pode-se fazer um POST para `http://localhost:8080/produtos/` e se obter o JSON passado na requisição.

Por fim, o Easter Egg do dia, porque embalou Ney embalou os pensamentos hoje.