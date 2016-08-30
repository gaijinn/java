# PROGRAMAVIMAS JAVA KALBA 

### GALUTINIO ĮVERTINIMO FORMULĖ
<ul>
<li>Galutinis įvertinimas = Projektas (40%) + Praktinės užduotys (30%) + Egzaminas (30%).</li>
</ul>

### PROJEKTAS  

Sukurti aplikaciją, kurioje būtų taikomi pagrindiniai objektinio programavimo principai:
- Temų sąrašą rasite čia: (https://github.com/fontpoint/JAVA/blob/master/temos.md).

___

### 1 užduotis.
___
Užduoties tikslas - sukurti mažiausiai 5 skirtingas Java klases ir jas sėkmingai sukompiliuoti: 
- Susipažinti su Java klasių rašymo tradicijomis; 
- Klasės turi turėti konstruktorius, parašyti 2 skirtingus ir bent vieną beargumentį, panaudoti this() konstrukciją;
- Keli prasmingi laukai, kuriems prieiga užtikrinama get/set metodais. Bent vienas laukas turi būti inicijuotas pradine reikšme;
- Sukurti (nestatinius) metodus. Bent vienas metodas turi būti perkrautas (overloaded);
- Įtraukti į klasės apibrėžimą ir prasmingai panaudoti static bei final elementus;
- Atsiskaitymui sukurti Main klasę, kurioje būtų vienas metodas main(), kuriame būtų aprašytas trumpas 'testavimo scenarijus';

___

### 2 užduotis.
___
Sukurtų klasių naudojimas.
- Patobulinti (išbaigti) II-oje užduotyje sukurtas klases (sukurti visus trūkstamus metodus, kelis prasmingus konstruktorius, 
  numatyti atributų pradines reikšmes(jei reikia - ir galimas) ir pan.). Tikėtina, kad reikės sukurti dar keletą prasmingų klasių;
- II-je užduotyje sukurtos klasės turi būti susijusios tarpusavyje 
  (pvz.: klasė Auditorija talpina savyje klasės Studentas objektus);
- Susipažinti ir prasmingai panaudoti biblioteką: Collection;
  taip pat reikia susipažinti su šiais interfeisais bei klasėmis (visų panaudoti programoje nebūtina):
  Collection, List(ArrayList, Vector, LinkedList), Queue(PriorityQueue), Set(HashSet, LinkedHashSet,TreeSet), Map(HashMap, Hashtable, TreeMap, LinkedHashMap);
- Generics - specialus kolekcijų apibrežimas. Panaudoti tai savo programoje, apibrėžiant savo kolekcijas.
- Susipažinti ir prasmingai panaudoti biblioteką: IO
  taip pat reikia ir teoriškai susipažinti su klasės String metodais: charAt(), concat(), equalsIgnoreCase(), length(), replace(), substring(), toString(), trim()  
- Programoje prasmingai panaudoti klases File, Reader, Writer;
- Vartotojo meniu. Sukurti trumpą ir nesudėtingą tekstinį vartotojo meniu, kuris (klaviatūros pagalba) leistų iškviesti metodus. 
  (objektų kūrimas gali išlikti ir main() metode);
- Programos kodą išskaidyti i Java paketus;
- Atsiskaitymui naudoti Main klasę, kurioje būtų vienas metodas main(), kuriame būtų aprašytas trumpas 'testavimo scenarijus';

___

### 3 užduotis.
___
Sukurtų klasių naudojimas. Esamų klasių tolimesnis tobulinimas.
- Paveldėjimas. Sukurti kelių klasių hierarchiją: iš tėvinės klasės išvesti bent 2 vaikines klases;
  taip pat susipažinti su Object klasės metodais: equals, hashcode.
  
- Abstrakti klasė. Sukurti abstrakčią klasę, turinčią bent 2 abstrakčius metodus;

- Java Interfeisas. Sukurti bent vieną interfeisą ir jį realizuoti (galima aprašyti Java interfeisą ir jau esamai klasei);

- Metodų perrašymas. Vaikinėse klasėse realizuoti abstrakčios tėvinės klasės metodą(-us);
  Žinoti kas yra Override. Prisiminti kas yra Overload.

- UML diagrama. Nubraižyti nesudėtingą UML klasių diagramą (braižant diagramą svarbiausia atkreipti dėmesį į sąryšius tarp klasių);
  UML diagrama turi būti tvarkingai nubraižyta ranka.

___

### 4 užduotis.
___
Klaidų mėtymas ir gaudymas. Trumpa pažintis su vartotojo grafinės sąsajos kūrimu (java.awt.*, javax.swing.*)
- Klaidos (try, catch, throw, throws, finally. klasės: Throwable, Exception, Error, RuntimeException, sąvokos: checked, unchecked (exception)). 
  Sukurti savo galimos klaidos klasę ir prasmingai ją panaudoti;

- Grafinė vartotojo sąsaja. Sukurti paprastą sąsają metodams iškviesti bei informacijai pavaizduoti, 
  persistengti nereikia, bet reikia mokėti pakomentuoti ir komponentus, net jei ir nepanaudosite savo programoje:
  JPanel, JButton, JOptionPane, JTextField, JLabel, JScrollPane ir kt.
  (Nereikia stengtis tekstinės sąsajos funkcionalumą(III užd.) perkelti į grafinę, tačiau svarbu, kad grafinė sąsaja (kokia ji bebūtų),
  būtų sukurta atskiroje klasėje/pakete, būtų išbaigta)
- Grafinėje sąsajoje parodyti savo metamos klaidos pranešimą;

- Suprasti ir mokėti orientuotis Java dokumentacijoje: http://docs.oracle.com/javase/8/docs/api/index.html. 
  Peržvelkite kurso metu paskaitose dėstytas bibliotekas.

- Skirkite laiko ir dar kartą peržiūrėkite savo programos kodą ir jei reikia - pasitaisykite.

___

### PRAKTINĖS UŽDUOTYS
- Programavimo kalbos JAVA užduotys, Android OS aplinkos pagrindinių išdėstymo būdų, meniu juostų, perėjimo tarp langų, fragmentų, sensorių taikymo ir kitų komponentų realizacija, kuriant mobiliąsias programėles, Swift programavimo kalbos užduotys, hibridinių aplikacijų užduotys. Praktinės užduotys yra atliekamos praktinių užsiėmimų metu.

### EGZAMINAS

- Testas sudarytas iš paskaitų metu išdėstytos teorinės medžiagos.   

### PROGRAMINĖ ĮRANGA

- NETBEANS IDE - <a href="http://www.oracle.com/technetwork/articles/javase/jdk-netbeans-jsp-142931.html">http://www.oracle.com/technetwork/articles/javase/netbeans.html</a> 
- ECLIPSE - <a href="https://eclipse.org/">https://eclipse.org/</a>
- INTELLIJ IDEA - <a href="https://www.jetbrains.com/idea/download/"> https://www.jetbrains.com/idea/download/</a> 
- ANDROID STUDIO - <a href="https://developer.android.com/studio/index.html#win-bundle">https://developer.android.com/studio/index.html#win-bundle</a>

### TEORINĖ MEDŽIAGA IR PROGRAMŲ PAVYZDŽIAI
- Teorinė medžiaga - https://github.com/fontpoint/JAVA/tree/master/PASKAIT%C5%B2%20MED%C5%BDIAGA
- Programų pavyzdžiai - https://github.com/fontpoint/JAVA

### LITERATŪROS SĄRAŠAS

1. Bruce Eckel. Thinking in Java, 3rd/4th Edition, 2003. 
2. A.Riškus. Programavimas Java. Pirmoji pažintis. Kaunas, Technologija, 2014. 
3. Java SE8 for the Really Impatient: A Short Course on the Basics (Java Series) 1st Edition, 2014. 
4. Java 8 Lambdas: Functional Programming For The Masses 1st Edition, 2014. 
5. Java SE8 for Programmers (3rd Edition) (Deitel Developer Series), 2014. 
6. R.Belevičius. Java technologijos. Mokomoji knyga. Technika. 2005. 
7. Udemy nemokami kursai internete rasite <a href="https://www.udemy.com/">čia</a>.
8. Tutorialspoint JAVA pagrindai internetinė prieiga rasite <a href="http://www.tutorialspoint.com/java/">čia</a>.
