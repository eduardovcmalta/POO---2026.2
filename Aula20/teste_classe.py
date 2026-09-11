class Pessoa:
    def __init__(self, nome, idade, peso):
        self.nome = nome
        self.idade = idade
        self.peso = peso

    def apresentacao(self):
        print('Ola, meu nome e:', self.nome, '; minha idade e:', self.idade, '; e meu peso e:', self.peso)


p1 = Pessoa('joao', 17, 50.35)
p1.apresentacao()
p2 = Pessoa('Maria', 20, 50.3)
p2.apresentacao()
p2.salario = 5783

print(p1.salario)
