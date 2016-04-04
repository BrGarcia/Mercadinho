[[DESIGN PATTERN: CLASS FACTORY WITH REFLECTION IN JAVA]]

Implantar o pattern Strategy (Estratégia) para o sistema de vendas.
• Deve-se implementar
– a classe Sale (Venda) de forma trivial
• ela não precisa fazer as ações da venda referentes ao processo de
venda. A classe venda deve implementar o seguinte:
– ter um atributo com um valor total da venda que deve ser pré-definido
no código (por exemplo, 1000 reais)
– ter um método que retorna o valor do total da venda que está no
atributo
– ter os métodos referentes ao pattern estratégia, conforme os slides da
aula
Trabalho em dupla sobre o pattern Estratégia
• implementem também
– a classe Factory,
• Que deve ter apenas o método que instancia e retorna a referência ao objeto que
representa a estratégia de venda vigente
• Desconsidere os outro métodos e atributos desta classe que constam no slide que a
apresenta
– duas classes que representem duas estratégias de venda distintas,
– a interface que essas duas classes implementarão,
– a uma classe registradora (Register) básica, que faz apenas o que está
previsto nos slides do padrão Estratégia
• O trabalho pode ser feito individualmente ou em dupla
• A data de entrega é 28/3
• A entrega deve ser feita respondendo ao e-mail enviado pelo professor
que descreve esse trabalho
