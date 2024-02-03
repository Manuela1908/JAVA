# Diretório de Programas

Este diretório contém scripts independentes que foram desenvolvidos para uso acadêmico.

## Descrição dos Scripts


#Gerenciador_De_Tarefas

O programa tem como função a criação de uma lista de tarefas usando checkboxes, que interagem com a barra de progresso calculando o numero de tarefas selecionadas pelo numero total de tarefas criada.
O usuário digita o texto no campo e clica em "+", ele deve digitar textos menores que 12 caracteres e não pode executar com um valor nulo.
Após ele criar uma tarefa, ela é adicionada ao Painel em forma de checkbox. O painel está organizado em 2 colunas, a proxima tarefa será inserida na segunda coluna. 
Se a última tarefa está localizada na segunda coluna, a próxima tarefa será adicionada na linha seguinte, na primeira coluna. O usuário pode adicionar no máximo 10 tarefas.

#DSU_e_NumeroPerfeito

O programa tem como função a entrada de um número e duas opções de operação, sendo Perfeito para a validação da soma de seus divisores e se resultam no próprio número, e DSU ou Dezena Soma Unidade, que consiste na transformação de um número de 2 algarismos em outro numero, concatenando: Dezena + Soma (unidade e dezena) + Unidade.
Possuindo algumas exigências, como a entrada de um numero inteiro e positivo, numero máximo de algarismos, e não permitindo valores nulos antes de executar. 

#Senha

Gerador de tokens baseados na entrada do usuário (senha). Possui 4 requisitos; senhas com pelo menos 8 caracteres, ao menos um numero, um caractere especial, e uma letra maiuscula, após a validação, converte cada caractere da senha em seu valor ASCII + proximo caractere da tabela, exemplo: "M" -> "109N" formando um token.
