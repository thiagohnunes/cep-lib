### Consulta CEP
O objetivo desta biblioteca é tornar mais simples o processo de consulta de endereços a partir do cep em aplicações JAVA.

Serviços implementados

ViaCep

Como realizar a consulta

```java
Cep.Builder builder = new Cep.Builder(CepProvider.VIA_CEP);
CepResponse response = builder.consultar("38695365");
```

Objeto retornado

Exceptions