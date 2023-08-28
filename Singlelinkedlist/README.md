## Getting Started

Here is a Single Linked List Materi

## Getting Started

Welcome to the Double Linked List, i will explain you about this material. 

## Basic Must To Know
Sebelum kesini pastiin kamu udah ada basic beberapa hal berikut :
1. Java Dasar
2. Java OOP
Source ?, ada banyak jangan manja.
> Yutub :
  1. Kelas terbuka
  2. Programer zaman now
  3. Bro Code(English Version)

## Who Am I
Anugrah Gilang Ramadhan

## Let's Start
Apa itu single linked list ? Single Linked List merupakan suatu linked list yang hanya memiliki satu variabel pointer saja. Dimana pointer tersebut menunjuk ke node selanjutnya. Biasanya field pada tail menunjuk ke NULL. Ada head dan tail dalam single linked list, dimana head merupakan awal data, tail menandakan akhir data.
 > Kelebihan
   1. Manajemen struktur data yang baik
   2. Meminimalisir penggunaan memory
Jadi secara sederhana single linked list itu cara lu naruh suatu data yang terhubung satu sama lain. Buat lebih ngerti liat ni visualnya :

<img width="469" alt="image" src="https://github.com/Langhere/Java-Algoritm-Data-and-Structure/assets/142018203/1f1285a7-e96c-4d7f-8fb0-fce7ba683a3c">

Nah dalam beberapa tutor yg gua buat kedepan, gw bakal pakek metode create and delete buat contohin kasusnya ya.

## Setup Package
Buat folder sesuai yang ada di directory ini. Lu bisa pake extension Java package manager di VS code. Disini gw makek konsep OOP class, objek, inheritance. 

## create first data
Logika create first data gini, lu sebagai karyawan minimarket dan lu ditugasin buat naruh keranjang belanja di tempatnya, nah di keranjang pertama dia satu-satunya kan ? nah jadi disini dia sebagai head dan tail. Kalo code sederhananya gini :
```
Node newnode = new Node();
newnode.data = data;
head = newnode;
tail = head;
tail.next = null;

```

jadi intinya ini data pertama langsung sebagai head dan tail ya.

## add data in first
Nah ini gw mau jelasin logikanya aja. Logikanya gini lu mau nambah data di first otomatis logikanya lu sambungin dulu yak data yang lu tambah ke head, dan ubah si data baru nya yang jadi head nya.

visual :

<img width="409" alt="image" src="https://github.com/Langhere/Java-Algoritm-Data-and-Structure/assets/142018203/ddfe9616-8d50-402f-90c9-35c0697fc19c">

## add data in last
Nah sebenernya logikanya sama aja kayak lu nambah di awal, bedanya mainin bagian tail. Gini kalo lu mau nambah data di akhir artinya itu bakal jadi tail dong ?, nah gini lu tinggal sambung aja tail sebelumnya ke data baru, buat si next dari data baru ke null, abis tu pindahin deh tailnya ke data baru.

visual :

<img width="421" alt="image" src="https://github.com/Langhere/Java-Algoritm-Data-and-Structure/assets/142018203/ad9af481-112f-45b6-b281-f9a9128fc24c">

## add data in middle
Nah ini nih serunya disini, eh ngga deng, gini logikanya misal nih lu punya data 1 2 3 , nah lu mau nambahin data 4 di posisi ke 2 artinya angka 2 kegeser kan jadi gini ntar 1 4 2 3. Nah logikanya buat ganti dia lu butuh data baru dan satu lagi sesuatu yang nunjuk ke posisi sebelum posisi yang lu geser kan ? supaya gini lo maksud gw misal mau ke posisi dua, nah sesuatu yang gw maksud anggap lah namanya temp, itu berenti di posisi sebelum yang lu ganti, contoh mau geser posisi ke dua, berarti temp nya ada di angka satu, nah abis tu data baru.next nya lu arahin ke temp.next, abis itu ganti deh temp.next ke data baru slesee. 

gini visual :

<img width="412" alt="image" src="https://github.com/Langhere/Java-Algoritm-Data-and-Structure/assets/142018203/89db2b14-c45c-4476-8563-84c276a9923c">

## delete first 

Logika delet first adalah menjadikan head.next nya sebagai head. jadi lu tinggal head = head.next. Gini lu buat node temp, isi pakek head, abis tu head = temp.next abis tu dah temp = null;

visual :
<img width="533" alt="image" src="https://github.com/Langhere/Java-Algoritm-Data-and-Structure/assets/142018203/d9531e4e-b7dd-44e3-9354-9118e17d4a49">

## remove last
nah ini mirip nih caranya cuman gini, buat sebuah node temp dimana berenti nya sebelum tail, nah itu ntar jadi si tail, tail.next tinggal null
nih buat lebih paham ada animasinya : https://www.geeksforgeeks.org/remove-last-node-of-the-linked-list/

## remove middle
Konsep nya mirip aja sih cuman disini kita butuh 2 bantuan, misal ada kasus 1 2 3 4 kita mau hapus posisi 3, nah pertama kita taruh bantuan misal prev itu di 2 dan bantuan satu lagi namanya del di posisi 3, abis tu kita arahin si prev.next itu = del.next abis itu udah del del.next = null;

visual :
<img width="452" alt="image" src="https://github.com/Langhere/Java-Algoritm-Data-and-Structure/assets/142018203/8b13c89c-eb7c-425b-9cbb-5ae37cfb30dc">

## last but not least
Gw tw lu pusing, tapi tahen ya trus latihan!!!!
