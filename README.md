
# Overview

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)

Um aplicativo para realizar a consulta dos CEP do Brasil, construído de forma simples e não muito robusta, porém escalável para futuras manutenções. 
Desenvolvido 100% na linguagem kotlin,
utiliza frameworks GSON e RETROFIT.

## Screenshot

1 | 2
:--:| :--:
![](https://github.com/InsertyEXE/consulta-cep-retrofit/blob/main/Screenshots/Screenshot_20220419_012158.png)|![](https://github.com/InsertyEXE/consulta-cep-retrofit/blob/main/Screenshots/Screenshot_20220419_012316.png)

## Features
* API: <https://viacep.com.br/ws/>
* Arquitetura: MVP
  * rest: Configurações do retrofit para requisição web
  * data: Repository realizando a requisição para o webservice
  * presenter: Realizando a lógica de negócio 
  * util: Abreviação de código 
  * view: UI do usuário
 
* Linguagens:

  * ![Kotlin](https://img.shields.io/badge/kotlin-%230095D5.svg?style=for-the-badge&logo=kotlin&logoColor=white) 100%  

* Bibliotecas:
  * Retrofit: com.squareup.retrofit2:retrofit:2.9.0' [Site retrofit squareup](<https://square.github.io/retrofit/>)
  * Gson: 'com.squareup.retrofit2:converter-gson:2.9.0' 
  * viewBinding: viewBinding{ enabled = true }

## Aplicativo
 Experimente: [Download Consultar cep](https://github.com/InsertyEXE/consulta-cep-retrofit/blob/main/Consulta%20cep.apk)
 
## TODO
 - Adicionar onSaveInstanceState para a rotação da tela
 
