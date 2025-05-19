# S1.01- Herència i Polimorfisme -

## Nivell 1 Exercici 1

### Descripció - Enunciat de l'exercici

L'exercici ens demana que creem una superclasse abstracta Instrument i les subclasses PercussionInstrument,
WindInstrument i WindInstrument i que que cadascuna d'aquestes adquireixin el mètode abstracte play() i respongui
un missatge propi.

La segona part de l'exercici ens demana que demostrem que les classes es poden carregar a partir de cridart a un
mètode estàtic o fent una instancia.

* Per demostrar la segona part comenteu en el codi del "MainInstruments" les línies de la 11
  a la 15.

## Nivell 1 Exercici 2

### Descripció - Enunciat de l'exercici

L'exercici ens demana que fem una classe anomenada Cotxe que tingui atribut final static marca,
static model i final potencia i ens pregunta la diferència entre els 3 i si algun es pot inicialitzar
des del constructor de la classe.

Després ens demana que fem dos mètodes un frenar que sigui static i un altre que sigui accelerar que sigui
no estàtic.

* L'atribut MARCA es una constant en l'àmbit de classe i s'ha d'inicialitzar a la declaració.
* L'atribut model és estàtic i, per tant, compartit per totes les instàncies i es pot modificar en qualsevol moment a
  través de la classe. Pot ser inicialitzat al constructor però des de la classe.
* L'atribut potencia és una constant d'instància en que cada objecte podrà tenir un valor diferent i s'assigna al
  constructor.

## Nivell 2 Exercici 1

### Descripció - Enunciat de l'exercici

* Crear una clase "Telèfon" que diversos atributs i el mètode trucar() amb un missatge per consola.
* Crear dues interfícies una de Relloge amb el mètode alarma() i l'altre Càmera amb el mètode foto().
* Crear una subclasse de rellotge anomenada SmarthWatch que implementi les interfícies.
* Cridar tots el mètodes des de el main.

## Nivllell 3 Exercici 1

### Descripció - Enunciat de l'exercici

En una redacció de notícies esportives tenen les notícies classificades per esports: futbol, bàsquet, tenis, F1 i motociclisme.
La redacció pot tenir més d’un redactor, i de cadascun d’ells volem saber el seu nom, el DNI i el sou. Un cop assignat un DNI, aquest no podrà canviar mai. 
Tots els redactors tenen el mateix sou, i si en un futur l’empresa pot incrementar-lo, ho farà a tothom per igual. De moment el sou actual és de 1500 €.
Cada redactor pot treballar en més d’una notícia. Les notícies han de tenir un titular, un text, una puntuació i un preu. En el moment de crear-se, el text ha d’estar buit.
A més, de les notícies de futbol s’ha de saber a quina competició fa referència(String), a quin club(String) i a quin jugador(String).
De les notícies de bàsquet s’ha d’indicar a quina competició fa referència(String) i a quin club(String).
De les notícies de tenis s’ha de saber de quina competició(String) parlen i de quins tenistes(String).
De les notícies d'F1 hem de saber a quina escuderia(String) fan referència.
De les notícies de motociclisme s’ha d’indicar de quin equip(String) són.
Les notícies es venen a diferents mitjans. Per saber el preu de cada notícia hem d'implementar un mètode que es diu calcularPreuNoticia().

## Tecnologies Utilizades
* Java
* IntelliJ
* Git

## Requisits
* Java 17
* IntelliJ (opcional)

## Instal·lació

1. Clona el repositori:
```
https://github.com/mxg952/S1.01-Herencia_Polimorfisme.git
```
2. Obre el projecte amb IntelliJ IDEA.

3. Executa la classe Main.java.

## Execució

## Desplegament

## Contribucions
El projecte ignora .idea/ .out/  .iml i .repository_token.

1. Fes un fork del repositori
2. Crea una nova branca   git checkout -b feature/NovaFuncionalitat
3. Fes els teus canvis i commiteja'ls:   git commit -m 'Afegeix Nova Funcionalitat'
4. Puja els canvis a la teva branca:   git push origin feature/NovaFuncionalitat
5. Fes un pull request
