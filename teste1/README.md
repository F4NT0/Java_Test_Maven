# Primeiro exemplo de Teste Unitário

### Como foi construido

* Utiliza-se o comando `mvn archetype:generate`
* Foi escolhido o formato padrão, no caso desse foi 1688, mas é só clicar enter para **Choose a number**
* Foi selecionado a opção de versão **1.4**
* groupId é **teste1**
* artifactId é **teste1**
* version é **1.0-SNAPSHOT**
* package é **teste1**

### Código

Foi desenvolvido um programa simples de conversão de Números romanos para Decimais,onde:

* Criado valores possíveis em um HashMap, como abaixo:

```java
private static Map<Character,Integer> map;
static {
    map = new HashMap<Character,Integer>();
    map.put('I',1);
    map.put('V',5);
    map.put('X',10);
    map.put('L',50);
    map.put('C',100);
    map.put('D',500);
}
```