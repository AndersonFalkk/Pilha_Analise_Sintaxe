/**
Uma expressão matemática pode usar vários pares de parênteses agrupados. Vejamos um exemplo:

6 - ( (A + ( B + C ) ) / ( ( D � 3 * E ) + ( F * A + 10))

Em uma expressão matemática, deseja-se que os pares de parênteses estejam corretamente agrupados. Por exemplo, as expressões exibidas a seguir são considerados inválidas:

( D - E ) ) OU ( ( D + E ) - A

De forma geral, toda vez que tivermos uma expressão com par�nteses, colchetes, chaves, será necessário verificar duas condições:

a) Se o número de parentes (colchetes ou chaves) de abertura é igual ao número de parênteses (colchetes ou chaves) de fechamento.

b) Se um parêntese de fechamento também é precedido pelo respectivo parêntese de abertura.

Podemos definir duas condições, que, obedecidas, expressam a veracidade do agrupamento de parênteses da expressão matemática:

1. No final da expressão, a diferença de parênteses (colchetes ou chaves) deve ser zero. Isso significa que todo parênteses (colchetes ou chaves) de abertura tem um parênteses (colchetes ou chaves) de fechamento, ou que pelo menos o número de parênteses (colchetes ou chaves) de abertura é igual ao número de parênteses (colchetes ou chaves) de fechamento.

2. A diferença de parênteses (colchetes ou chaves) em qualquer ponto da expressão é sempre positiva. A verificação dessa condição garante que não deve existir um parênteses (colchetes ou chaves) de abertura sem o respectivo parênteses (colchetes ou chaves) de fechamento. 
*/

/**
 *
 * @author Anderson Dias - 13102904
 */
public class Pi {
    
    // atributos
    private Object [] valor;
    private int ElemTopo;
    
    // Construtor - Cria uma pilha vazia com tamanho escolhida
    public Pi (int tamanho) {
        valor = new Object[tamanho];
        ElemTopo = -1;
    }
    
    // m�todos
    public boolean taCheia() {
        return (ElemTopo == valor.length - 1);
    }
    
    public boolean taVazia () {
        return (ElemTopo == -1);
    }
    
    public void push (Object x) {
        if(!taCheia()) {
            ElemTopo++;
            valor[ElemTopo] = x;
        }
    }
    
    public Object pop () {
        if (!taVazia()) {
            Object x = valor[ElemTopo];
            ElemTopo--;
            return x;
        } else {
            return null;
        }
    }
    
    public Object ElemTopo () {
        if(!taVazia()) {
            return valor[ElemTopo];
        } else {
            return null;
        }
    }
}