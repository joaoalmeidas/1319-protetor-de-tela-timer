# 1319-protetor-de-tela-timer
O pacote javax.swing contém uma classe chamada Timer que é capaz de chamar o método actionPerformed da interface ActionListener em um intervalo fixo de tempo (especificado em milissegundos). 
Modifique sua
solução da Questão 13.18 para remover a chamada repaint a partir do método paintComponent. Declare sua classe para implementar
ActionListener. (O método actionPerformed deve simplesmente chamar repaint.) Declare uma variável de instância do tipo
Timer chamada timer em sua classe. No construtor da sua classe, escreva as seguintes instruções:

timer = new Timer(1000, this);

timer.start();

Isso cria uma instância de classe Timer que chamará o método actionPerformed do objeto this a cada 1000 milissegundos (isto é,
um segundo).
