Andrea Stevanoska 226001

2. За дадениот код во функцијата function нацртајте Control Flow Graph со некоја 
   алатка за цртање дијаграми. Внесете го нацртанот CFG во документацијата.
  
![broj-regioni-i-predikatni-jazli](https://github.com/Andrea-444/SI_2024_lab2_226001/assets/139055617/d4de2c1a-860a-483c-ae28-cdb8f4c89e66)

3. Жолтите ознаки - Ri каде i e integer, означуваат региони, а виолетовите ознаки Pj каде j е исто    така integer означуваат предикатни јазли. Според мојата пресметка на сите три начини,
   цикломатската комплексност за овој дијаграм е 10.
   Начин 1: Број на региони = Како што може да се забележи на сликата бројот на региони е 10.
   Начин 2: Број на предикатни јазли + 1 = Бројот на предикатни јазли е 9, па 9 + 1 = 10
   Начин 3: Број на ребра - број на јазли + 2 = Бројот на ребра е 29, бројот на јазли е 21,
   па 29 - 21 + 2 = 10

4.
checkCart(allItems = null, payment = 100) враќа RuntimeException("allItems list can't be null!")
Ребро 2->3 од IF1

checkCart(allItems = [new Item(null, null, 100, 0)], payment = 100) враќа RuntimeException("No barcode!")
Ребро 2->4 од IF1
Ребро 7->8 од IF2
Ребро 9->20 од IF3

checkCart(allItems = [new Item("Item1", "1C34567890", 100, 0)], payment = 100) враќа RuntimeException("Invalid character in item barcode!");
Ребро 2->4 од IF1
Ребро 7->9 од IF2
Ребро 9->10 од IF3
Ребро 14->15 од IF4

checkCart(allItems = [new Item("Item1", "0234567891", 500, 0.5)], payment = 100) враќа
false ----> sum = 220 = 500*0.5-30 
Ребро 2->4 од IF1
Ребро 7->9 од IF2
Ребро 9->10 од IF3
Ребро 14->12.3 од IF4
Ребро 17->18 од IF5
Ребро 21->22 од IF6
Ребро 24->26 од IF7

checkCart(allItems = [new Item("Item1", "0234567891", 50, 0)], payment = 100) враќа true ----> sum = 50
Ребро 2->4 од IF1
Ребро 7->9 од IF2
Ребро 9->10 од IF3
Ребро 14->12.3 од IF4
Ребро 17->19 од IF5
Ребро 21->5.3 од IF6
Ребро 24->25 од IF7

![image](https://github.com/Andrea-444/SI_2024_lab2_226001/assets/139055617/075dcbc3-9e81-404a-b5af-bea778ec8175)

5. 
Format: Combination TestCase Branch

TTT    checkCart(allItems = [new Item("Item1", "0234567891", 500, 0.5)], payment = 100) 	  21->22
TTF    checkCart(allItems = [new Item("Item1", "1234567890", 500, 0.5)], payment = 100)	  21->5.3
TFX	 checkCart(allItems = [new Item("Item1", "0234567891", 500, 0)], payment = 100)		  21->5.3
FXX	 checkCart(allItems = [new Item("Item1", "0234567891", 200, 0.5)], payment = 100)	  21->5.3



