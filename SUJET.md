# WizBakTop

Vous devez créer un outil qui permette de générer le WizBakTop pour un nombre donné en ligne de commande.

## Partie I

Les règles du WizBakTop sont les suivantes :
* Si le nombre est divisible par 3, écrire 'Wiz' à la place du nombre
* Si le nombre est divisible par 5, ajouter 'Bak'
* Si le nombre est divisible par 7, ajouter 'Top'
* Pour chaque digit 3, 5, 7, ajouter 'Wiz', 'Bak' et 'Top' dans l'ordre des digits

Exemples :

```sh
my-pc$: wizbaktop 1
my-pc$: 1

my-pc$: wizbaktop 2
my-pc$: 2

my-pc$: wizbaktop 3
my-pc$: WizWiz (divisible par 3, contient 3)

my-pc$: wizbaktop 5
my-pc$: BakBak (divisible par 5, contient 5)

my-pc$: wizbaktop 6
my-pc$: Wiz (divisible par 3)

my-pc$: wizbaktop 15
my-pc$: WizBakBak (divisible par 3 et 5, contient 5)

my-pc$: wizbaktop 33
my-pc$: WizWizWiz (divisible par 3, contient 3 et 3)

my-pc$: wizbaktop 35
my-pc$: BakTopWizBak (divisible par 5 et 7, contient 3 et 5)

my-pc$: wizbaktop 357
my-pc$: WizTopWizBakTop (divisible par 3 et 7, contient 3, 5 et 7 dans cet ordre)

my-pc$: wizbaktop 703
my-pc$: TopWiz (contient 7 et 3 dans cet ordre)

my-pc$: wizbaktop 13705
my-pc$: BakWizTopBak (divisible par 5, contient 3, 7 et 5 dans cet ordre)
```

## Partie II

Votre devez maintenant garder une trace des 0 contenus dans les nombres traités.
Pour cela, chaque 0 doit être remplacé par le caractère '*'.

Exemples précédents avec la nouvelle règle:

```sh
my-pc$: wizbaktop 703
my-pc$: Top*Wiz (contient 7, 0 et 3 dans cet ordre)

my-pc$: wizbaktop 13705
my-pc$: BakWizTop*Bak (divisible par 5, contient 3, 7, 0 et 5 dans cet ordre)
```