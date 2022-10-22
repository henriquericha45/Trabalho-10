; Henrique Levandoski Richa

; 1. Na aula disponível em: https://replit.com/@frankalcantara/ClojureAula2?v=1 foram
; destacadas diversas funções (expressões), como funções de primeira ordem, disponíveis em
; Clojure. Sua primeira tarefa será descrever cada uma destas funções e apresentar dois
; exemplos de uso de cada uma delas. Lembre-se os exemplos precisam ser utilizados de
; forma que o resutado da função possa ser visto no terminal.

(println "Função 'sort' organiza uma lista em ordem crescente: ")
(println(sort[1 3 5 4]))
(println(sort[4 7 1 2 8]))

(println "Função 'range' cria uma lista com tamanho 'n'")
(println(range 10))
(println(range 5))

; 2. Utilizando a linguagem Clojure, crie uma função chamada ehPrimo que receba um inteiro e
; devolva True caso este inteiro seja verdadeiro e False caso contrário.
(defn ehPrimo [n]
    (if (empty? (filter #(= (mod n %) 0) (range 2 n)))
        true
        false))

(print "Func. 2: entrada: 7; resultado: ")
(println(ehPrimo 7))

; 3. Utilizando a linguagem Clojure, crie uma função chamada fatoresPrimos que receba um
; inteiro e devolva uma lista dos seus fatores primos. Decomposição em fatores primos é uma
; tarefa fundamental da aritmética.
(defn fatoresPrimos
    ([n]
        (fatoresPrimos n 2))
    ([n i]
        (if (<= i n)
            (if (and (= (mod n i) 0) (ehPrimo i))
                (cons i (fatoresPrimos (/ n i) i))
                (fatoresPrimos n (+ i 1)))
            [])))

(print "Func. 3: entrada: 12; resultado: ")
(println(fatoresPrimos 12))

; 4. Utilizando a linguagem Clojure, crie uma função chamada todosPrimos que receba dois
; valores inteiros e devolve todos os números primos que existam entre estes dois valores.
(defn todosPrimos [a b]
    (filter ehPrimo (range a b)))

(print "Func. 4: entrada: 1 10; resultado: ")
(println(todosPrimos 1 10))