# Projeto de Entregas - Tartaruga Cometa

## Descrição

Este projeto é uma aplicação web para gerenciar entregas, desenvolvido usando Spring Boot e PostgreSQL.
### 1. Certifique-se de ter o JDK/JRE Instalado
Antes de iniciar a aplicação, verifique se você tem o JDK ou JRE instalado. Isso é necessário para rodar o arquivo JAR.
Verifique a versão instalada:

java -version

### 2. Baixe o Arquivo Executável
Link para download do executável está no RELEASE.

### 3. Inicie a Aplicação
Para iniciar a aplicação, abra um terminal ou prompt de comando e navegue até o diretório onde o arquivo JAR está localizado.

Use o comando java -jar para iniciar a aplicação:

java -jar nome-do-arquivo.jar

Substitua nome-do-arquivo.jar pelo nome real do seu arquivo JAR.

Exemplo:
Se o seu arquivo executável se chama tartaruga-cometa.jar, o comando seria:

java -jar tartaruga-cometa.jar

### 4. Configurar a Porta (Opcional)
Se você precisar alterar a porta na qual a aplicação está rodando (por exemplo, se a porta 8080 já estiver em uso), você pode configurar isso através de variáveis de ambiente ou parâmetros de linha de comando, dependendo de como a aplicação foi configurada.

Para uma aplicação Spring Boot, você pode definir a porta como uma variável de ambiente:

java -jar tartaruga-cometa.jar --server.port=8081

Ou configurar diretamente no arquivo application.properties ou application.yml da aplicação.

### 5. Verificar Logs e Status
Após iniciar a aplicação, observe a saída do terminal para verificar se há mensagens de erro ou confirmações de que a aplicação foi iniciada com sucesso.

Se a aplicação usar um servidor web, você pode acessá-la através do navegador em http://localhost:8080 (ou a porta que você configurou).

Problemas Comuns:
Porta já em uso: Se a porta padrão (por exemplo, 8080) estiver em uso, mude para outra porta usando o parâmetro --server.port.

Erro de Dependências: Se a aplicação falhar ao iniciar, pode ser devido a dependências ausentes. Verifique os logs para mais detalhes e certifique-se de que todas as dependências estão corretamente incluídas no arquivo JAR.
