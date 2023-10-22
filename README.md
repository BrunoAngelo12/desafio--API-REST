# Desafio--API-REST
Java RESTful API criada para resolução do Desafio DIO

### Diagrama de Classes

```mermaid
classDiagram
  class Resident {
    - name: String
    - email: String
    - phone: String
    - apartment: Apartment
    - ideas_for_condominium: String[]  <!-- Atributo de array -->
  }

  class Apartment {
    - tower: Int
    - number: Int
    - intercom: Int
  }

  Resident "1" *-- "1" Apartment : resides in




