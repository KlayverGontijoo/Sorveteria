# Sorveteria
Projeto desenvolvido para a disciplina de Analise e Desenvolvimento de Sistemas
Klayver Gontijo - klaivergontijo@unipam.edu.br
Fabio Andre -  fabioap@unipam.edu.br

Utilizamos o pattern Template para que o cliente consiga efetuar o pagamento da sua compra somente quando o pedido for efetuado, calculado e mostrado à ele.
O Template nos permitiu que o pagamento só poderá ser realizado após todas esses métoddos forem executados especificamente nessa ordem, impedindo que o cliente faça o pagamento antes de gerar o pedido, ou até mesmo antes do valor da compra ser calculado.

Utilizamos o pattern State afim de que o cliente possa escolher um tipo específico de açaí, mudando apenas os adicionais.Por exemplo, o produto muda de comportamento devido a escolha que o cliente faz, trocando os adicionais fruta, cereal,chocolate e o doce. Especificando seria como se fosse um cardápio de açaí.

Utilizamos o pattern Strategy para fazer a escolha da calda do sorvete, sendo ela de morango ou caramelo. Neste pattern não ocorre a mudança do sorvete mas sim da cobertura dele. Com isso a calda é mudada em tempo de execução. Se acaso quisermos acrescentar mais uma cobertura não mudaremos nada na classe principal e sim criaremos outra classe contendo a  implementação da cobertura.
