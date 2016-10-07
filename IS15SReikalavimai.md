# PROGRAMAVIMAS JAVA KALBA 

### PAPILDOMA INFORMACIJA IS15S GRUPEI
- Norintiems atsisiųsti viena katalogą iš pavyzdžių skilties čia rasite API (http://kinolien.github.io/gitzip/), kuriame nurodomas kelias iki katalogo (URL adresas).

### GALUTINIO VERTINIMO FORMULĖ

**Galutinis vertinimas** = Projektas (70%) + Egzaminas (30%).


### PROJEKTAS  
___

Sukurti aplikaciją, kurioje būtų taikomi pagrindiniai objektinio programavimo principai:
- Temų sąrašą rasite čia: (https://github.com/fontpoint/JAVA/blob/master/temos.md).

___


### 1 užduotis.
___
**Užduoties tikslas** - sukurti mažiausiai 5 skirtingas Java klases ir jas sėkmingai sukompiliuoti: 
- Susipažinti su Java klasių rašymo tradicijomis.
- Klasės turi turėti konstruktorius, parašyti 2 skirtingus ir bent vieną beargumentį, panaudoti this() konstrukciją.
- Keli prasmingi laukai, kuriems prieiga užtikrinama get/set metodais. Bent vienas laukas turi būti inicijuotas pradine reikšme.
- Sukurti (nestatinius) metodus. Bent vienas metodas turi būti perkrautas (overloaded).
- Įtraukti į klasės apibrėžimą ir prasmingai panaudoti static bei final elementus.
- Atsiskaitymui sukurti Main klasę, kurioje būtų vienas metodas main(), kuriame būtų aprašytas trumpas 'testavimo scenarijus'.

___

### 2 užduotis.
___
Sukurtų klasių naudojimas.
- Patobulinti (išbaigti) I-oje užduotyje sukurtas klases (sukurti visus trūkstamus metodus, kelis prasmingus konstruktorius, 
  numatyti atributų pradines reikšmes(jei reikia - ir galimas) ir pan.). Tikėtina, kad reikės sukurti dar keletą prasmingų klasių.
- I-oje užduotyje sukurtos klasės turi būti susijusios tarpusavyje 
  (pvz.: klasė Auditorija talpina savyje klasės Studentas objektus).
- Susipažinti ir prasmingai panaudoti biblioteką: Collection.
  taip pat reikia susipažinti su šiais interfeisais bei klasėmis (visų panaudoti programoje nebūtina):
  Collection, List(ArrayList, Vector, LinkedList), Queue(PriorityQueue), Set(HashSet, LinkedHashSet,TreeSet), Map(HashMap, Hashtable, TreeMap, LinkedHashMap).
- Generics - specialus kolekcijų apibrežimas. Panaudoti tai savo programoje, apibrėžiant savo kolekcijas.
- Susipažinti ir prasmingai panaudoti biblioteką: IO
  taip pat reikia ir teoriškai susipažinti su klasės String metodais: charAt(), concat(), equalsIgnoreCase(), length(), replace(), substring(), toString(), trim(). 
- Programoje prasmingai panaudoti klases File, Reader, Writer.
- Vartotojo meniu. Sukurti trumpą ir nesudėtingą tekstinį vartotojo meniu, kuris (klaviatūros pagalba) leistų iškviesti metodus. 
- Programos kodą išskaidyti i Java paketus.
- Atsiskaitymui naudoti Main klasę, kurioje būtų vienas metodas main(), kuriame būtų aprašytas trumpas 'testavimo scenarijus'.

___

### 3 užduotis.
___
Sukurtų klasių naudojimas. Esamų klasių tolimesnis tobulinimas.
- **Paveldėjimas**. Sukurti kelių klasių hierarchiją: iš tėvinės klasės išvesti bent 2 vaikines klases taip pat susipažinti su Object klasės metodais: equals, hashcode.
  
- **Abstrakti klasė**. Sukurti abstrakčią klasę, turinčią bent 2 abstrakčius metodus.

- **Java Interfeisas**. Sukurti bent vieną interfeisą ir jį realizuoti (galima aprašyti Java interfeisą ir jau esamai klasei).

- **Metodų perrašymas**. Vaikinėse klasėse realizuoti abstrakčios tėvinės klasės metodą(-us), žinoti kas yra Override prisiminti kas yra Overload.

- **UML diagrama**. Nubraižyti nesudėtingą UML klasių diagramą (braižant diagramą svarbiausia atkreipti dėmesį į sąryšius tarp klasių). UML diagrama turi būti tvarkingai nubraižyta naudojant (http://alexdp.free.fr/violetumleditor/page.php) ar bet kuriuo kitu įrankiu skirtu UML diagramoms braižyti.

___

### 4 užduotis.
___
**Klaidų mėtymas ir gaudymas**. Trumpa pažintis su vartotojo grafinės sąsajos kūrimu (java.awt.*, javax.swing.*):
- Klaidos (try, catch, throw, throws, finally. klasės: Throwable, Exception, Error, RuntimeException, sąvokos: checked, unchecked (exception)). 
- Sukurti savo galimos klaidos klasę ir prasmingai ją panaudoti;
- Grafinė vartotojo sąsaja. Sukurti paprastą sąsają metodams iškviesti bei informacijai pavaizduoti, 
  persistengti nereikia, bet reikia mokėti pakomentuoti ir komponentus, net jei ir nepanaudosite savo programoje:
  JPanel, JButton, JOptionPane, JTextField, JLabel, JScrollPane ir kt.
- Grafinėje sąsajoje parodyti savo metamos klaidos pranešimą.
- Suprasti ir mokėti orientuotis Java dokumentacijoje: (http://docs.oracle.com/javase/8/docs/api/index.html). 

___


### EGZAMINAS

- Testas sudarytas iš paskaitų metu išdėstytos teorinės medžiagos.   

### PROGRAMINĖ ĮRANGA

- NETBEANS IDE - (http://www.oracle.com/technetwork/articles/javase/jdk-netbeans-jsp-142931.html).
- ECLIPSE - (https://eclipse.org/).
- INTELLIJ IDEA - (https://www.jetbrains.com/idea/download/).
- ANDROID STUDIO - (https://developer.android.com/studio/index.html#win-bundle).

### TEORINĖ MEDŽIAGA IR PROGRAMŲ PAVYZDŽIAI
- Teorinė medžiaga - (https://github.com/fontpoint/JAVA/tree/master/PASKAIT%C5%B2%20MED%C5%BDIAGA).
- Programų pavyzdžiai - (https://github.com/fontpoint/JAVA).

### LITERATŪROS SĄRAŠAS

1. Bruce Eckel. Thinking in Java, 3rd/4th Edition, 2003. 
2. A.Riškus. Programavimas Java. Pirmoji pažintis. Kaunas, Technologija, 2014. 
3. Java SE8 for the Really Impatient: A Short Course on the Basics (Java Series) 1st Edition, 2014. 
4. Java 8 Lambdas: Functional Programming For The Masses 1st Edition, 2014. 
5. Java SE8 for Programmers (3rd Edition) (Deitel Developer Series), 2014. 
6. R.Belevičius. Java technologijos. Mokomoji knyga. Technika. 2005. 
7. Udemy nemokami kursai - (https://www.udemy.com/).
8. Tutorialspoint JAVA pagrindai - (http://www.tutorialspoint.com/java/).
9. JAVA ir Android OS detalus aprašymas su pavyzdžių detaliais paaiškinimais - (http://www.java2s.com/).
