Andrea Stevanoska 226001
---------------------------------------------

2. Control Flow Graph
  
![broj-regioni-i-predikatni-jazli](https://github.com/Andrea-444/SI_2024_lab2_226001/assets/139055617/d4de2c1a-860a-483c-ae28-cdb8f4c89e66)

3. Жолтите ознаки - Ri каде i e integer, означуваат региони, а виолетовите ознаки Pj каде j е исто    така integer означуваат предикатни јазли. Според мојата пресметка на сите три начини,
   цикломатската комплексност за овој дијаграм е 10.
   - Начин 1: Број на региони = Како што може да се забележи на сликата бројот на региони е 10.
   - Начин 2: Број на предикатни јазли + 1 = Бројот на предикатни јазли е 9, па 9 + 1 = 10
   - Начин 3: Број на ребра - број на јазли + 2 = Бројот на ребра е 29, бројот на јазли е 21, па 29 - 21 + 2 = 10

4.
- checkCart(allItems = null, payment = 100) враќа RuntimeException("allItems list can't be null!")
  - Ребро 2->3 од IF1

- checkCart(allItems = [new Item(null, null, 100, 0)], payment = 100) враќа RuntimeException("No barcode!")
  - Ребро 2->4 од IF1
  - Ребро 7->8 од IF2
  - Ребро 9->20 од IF3

- checkCart(allItems = [new Item("Item1", "1C34567890", 100, 0)], payment = 100) враќа RuntimeException("Invalid character in item barcode!");
  - Ребро 2->4 од IF1
  - Ребро 7->9 од IF2
  - Ребро 9->10 од IF3
  - Ребро 14->15 од IF4

- checkCart(allItems = [new Item("Item1", "0234567891", 500, 0.5)], payment = 100) враќа false ----> sum = 220 = 500*0.5-30 
  - Ребро 2->4 од IF1
  - Ребро 7->9 од IF2
  - Ребро 9->10 од IF3
  - Ребро 14->12.3 од IF4
  - Ребро 17->18 од IF5
  - Ребро 21->22 од IF6
  - Ребро 24->26 од IF7

- checkCart(allItems = [new Item("Item1", "0234567891", 50, 0)], payment = 100) враќа true ----> sum = 50
  - Ребро 2->4 од IF1
  - Ребро 7->9 од IF2
  - Ребро 9->10 од IF3
  - Ребро 14->12.3 од IF4
  - Ребро 17->19 од IF5
  - Ребро 21->5.3 од IF6
  - Ребро 24->25 од IF7

![image](https://github.com/Andrea-444/SI_2024_lab2_226001/assets/139055617/075dcbc3-9e81-404a-b5af-bea778ec8175)

5. 
![image](https://github.com/Andrea-444/SI_2024_lab2_226001/assets/139055617/cd824271-f3f0-46c9-a9fb-0d900213ebc3)

- Првиот тест случај го исполнува целосниот услов (со тоа што трите услови поврзани со логичко И се точни) и се извршува командата во него.
- Вториот тест случај не го исполнува целосниот услов, бидејќи третиот услов за баркодот не е исполнет.
- Третиот тест случај исто така не го исполнува целосниот услов, бидејќи вториот услов во заградата (за попустот) не е исполнет, без разлика на тоа дали третиот е исполнет - резултатот ќе биде ист секогаш.
- Последниот тест случај не го исполнува целосниот услов бидејќи уште првиот услов за цената не е исполнет и без разлика на точноста на следните два услови - резултатот ќе биде секогаш ист.

6. Објаснување за Unit - тестовите

   - assertThrows го користев за проверка дали функцијата успешно фрла исклучок при одреден тест пример.
   - assertTrue го искористив после секој assertThrows, за проверка дали исклучокот е од очекуваниот тип.
- Овие функции ги искористив во првите три тест случаи од Every Branch методата, кога се очекува функцијата да фрли исклучок од соодветен тип.

   - assertTrue го употребив за да проверам дали при внес на одреден тест пример се добива очекуваниот излез од функцијата, односно True.
   - assertFalse го употребив за да проверам дали при внес на одреден тест пример се добива очекуваниот излез од функцијата, односно False.
- Овие функции ги искористив во последните два тест случаи од Every Branch методата, кога програмата се очекува да работи нормално и без исклучоци, со враќање на соодветен излез од истата (true/false). Ги користев и во сите тест случаи од Multiple Condition методата, каде бидејќи условот е поврзан со логичко И, само една комбинација би влегла внатре во условот и со помош на asserts се проверува повторно дали се добива очекуваниот излез од функцијата (за TTT - False, за TTF - False, за TFX - False и за FXX - True).
  



