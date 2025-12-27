public record Pessoa(String nome, int idade, String cidade) {

}

/*
public: Modificador de acesso: torna o record visível fora do pacote.

record

Palavra-chave que declara um record, um tipo de dado projetado para representar dados imutáveis e concisos.

Records reduzem boilerplate: o compilador gera construtor, campos finais, métodos equals(), hashCode() e toString(), além de accessors automáticos.

Pessoa

Nome do record (o tipo).

(String nome, int idade, String cidade)

Componentes do record — definem os dados que o record contém.

Para cada componente:

O compilador cria implicitamente um campo privado e final.

Cria um accessor com o mesmo nome do componente: nome(), idade(), cidade().

Cria um construtor canônico que recebe (String nome, int idade, String cidade).

{ }

Corpo do record. Pode ficar vazio (como no seu caso) ou conter:

Implementações de métodos adicionais.

Um construtor compacto para validação (ex.: checar idade >= 0).

Campos estáticos, métodos estáticos, etc.

Mesmo que o corpo esteja vazio, o record já tem todos os métodos úteis gerados automaticamente.

O que o record gera implicitamente (resumido)

Campos privados e finais: private final String nome; private final int idade; ...

Construtor canônico: public Pessoa(String nome, int idade, String cidade) { ... }

Accessors: public String nome() { return nome; } etc.

equals(Object), hashCode() e toString() com comportamento baseado nos componentes.

Como usar o record no código

Para acessar o nome: pessoa.nome().

Para acessar a idade: pessoa.idade().

Para acessar a cidade: pessoa.cidade().
*/
