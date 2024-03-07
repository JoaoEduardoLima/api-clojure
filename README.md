# Sobre o projeto

Projeto simples de API usado para estudos.

Quando iniciado a api, é possivel através do navegador http://localhost:3003/teste vizualizar o funcionameto da API.

No primeiro acesso, é direcionado para um arquivo em HTML. Se a página for atualizada, uma mensagem em texto mostra quantas vezes foi reiniciada a página.

Caso demore mais de 30 segundos para atualizar, o contador será reiniciado, retornando para a página inicial.


## Iniciar a API

Para iniciar a API, é necessário ter instalado o docker na máquina.

Baixar a imagem docker do clojure.
```
docker pull clojure
```
Através do Terminal no diretório do projeto inserir o comando a baixo (Windowns ou Linux):

Windowns
```
docker run -it --rm --name clojure -v ${pwd}:/work -w /work -p 3003:3003 clojure /bin/bash
```
Linux

```
docker run -it --rm --name clojure -v %cd%:/work -w /work -p 3003:3003 clojure /bin/bash
```

Em seguida iniciar com o comando
```PowerShell
lein run
```

Acessar no navegador
http://localhost:3003/teste

## Referência

- https://github.com/ring-clojure/ring/wiki/Concepts
