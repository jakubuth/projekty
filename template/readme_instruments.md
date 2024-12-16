# Zadanie Domowe – Klasy Abstrakcyjne i Dziedziczenie w Java

## Ważne Uwagi

1. **Praca musi być samodzielna!**  
   Rozwiąż zadanie bez konsultacji z innymi. Rozmowy z kolegami, zadawanie pytań i odpowiadanie na pytania dotyczące tego zadania (zarówno w trakcie jego rozwiązywania, jak i po ukończeniu) będą uznane za brak samodzielności. Skutkuje to **brakiem możliwości otrzymania plusa za aktywność na ćwiczeniach**.

2. **Pomaganie innym**, nawet po ukończeniu zadania, również spowoduje utratę uzyskanego wcześniej plusa.

3. Zadanie należy rozwiązać w środowisku **IntelliJ IDEA**.

4. **Zrzut ekranu na dowód samodzielności:**
   - Otwórz dysk `z:` w swoim systemie.
   - Na zrzucie ekranu powinny być widoczne: 
     - wszystkie testy przechodzące (w zakładce testów IntelliJ IDEA, po rozwinięciu opcji `Show Passed`),  
     - Twój identyfikator użytkownika (login z systemu).  

5. Po wykonaniu zrzutu ekranu, **wyślij swoje rozwiązanie na GitHub**.

---

## Treść Zadania

Stwórz hierarchię klas, która odwzorowuje różne rodzaje instrumentów muzycznych. Zadanie ma na celu przećwiczenie dziedziczenia oraz wykorzystania klas abstrakcyjnych w Javie. Napisane klasy powinny spełniać wymagania zawarte w dostarczonych testach.

---

### Wymagania

1. **Pakiet**:  
   - Wszystkie klasy umieść w pakiecie `pl.example.instruments`.

2. **Klasa abstrakcyjna `Instrument`**:
   - Pole `String name`, przechowujące nazwę instrumentu.
   - Konstruktor przyjmujący `name` i przypisujący go do pola `name`.
   - Metoda `String getName()`, która zwraca nazwę instrumentu.
   - Abstrakcyjna metoda `void play()`, która będzie definiowana w klasach dziedziczących.
   - Abstrakcyjna metoda `String sound()`, która zwróci dźwięk charakterystyczny dla danego instrumentu.

3. **Klasy dziedziczące:**
   - **Klasa `Piano`**:
     - Metoda `play()` wyświetla `"Piano is playing"`.
     - Metoda `sound()` zwraca `"Plink"`.
   - **Klasa `Guitar`**:
     - Metoda `play()` wyświetla `"Guitar is strumming"`.
     - Metoda `sound()` zwraca `"Strum"`.
   - **Klasa `Drum`**:
     - Metoda `play()` wyświetla `"Drum is beating"`.
     - Metoda `sound()` zwraca `"Boom"`.

4. **Testy:**
   - Przetestuj klasy przy użyciu dostarczonych testów w pliku `InstrumentTest` (dostarczone w kodzie projektu).
   - Testy weryfikują poprawność implementacji metod `play()` i `sound()` oraz działania konstruktora.

---

## Co należy oddać?

1. **Pliki `.java`**:
   - `Instrument`, `Piano`, `Guitar`, `Drum`.

2. **Zrzut ekranu**:
   - Widoczne wszystkie testy, które przeszły (zakładka testów IntelliJ IDEA, z rozwiniętą opcją `Show Passed`).
   - Widoczny identyfikator użytkownika (login w systemie po otwarciu dysku `z:`).


