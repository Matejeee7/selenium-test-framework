# Selenium Test Framework

Ovaj projekt predstavlja jednostavan okvir (framework) za automatsko testiranje web aplikacija korištenjem Selenium WebDrivera, TestNG-a i Maven alata.

Testovi su izrađeni nad demo aplikacijom: https://the-internet.herokuapp.com

---

## Korištene tehnologije

- Java  
- Maven  
- Selenium WebDriver  
- TestNG  
- WebDriverManager  

---

## Funkcionalnosti

- Page Object Model (razdvajanje testne logike i elemenata stranice)
- Explicit waits pomoću WebDriverWait
- Automatsko preuzimanje web drivera pomoću WebDriverManagera
- Screenshot prilikom pada testa
- Generiranje Maven Surefire izvještaja

---

## Pokriveni testni slučajevi

Projekt sadrži 6 automatiziranih testova koji pokrivaju:

- Uspješnu i neuspješnu prijavu korisnika
- Rad s checkbox elementima
- Odabir vrijednosti iz dropdown liste
- Dinamičko učitavanje sadržaja
- Upload datoteke

---

## Pokretanje projekta

### Preduvjeti

- Instalirana Java (verzija 17 ili novija)
- IntelliJ IDEA
- Google Chrome

---

### Pokretanje testova

Run ikonica u IntelliJ programu
