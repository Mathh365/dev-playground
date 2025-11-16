namespace HostileEntities
{
    public class Inimigo
    {
        public string? Nome {get; set;}
        public int HPTotal { get; set; } = 100;
        public double HPAtual {get; set;} = 100;
        public int Velocidade {get; set;}

        public Inimigo (string nome, int Velocidade)
        {
            this.Nome = nome;
            this.Velocidade = Velocidade;
        }

        public string Info()
        {
            return $"""
            Infos do {this.Nome}
            Nome do Inimigo: {this.Nome}
            HP: {this.HPAtual}/{this.HPTotal}
            Velocidade: {this.Velocidade}
            """;
        }

        public void TakeDamage(double dano)
        {
            // int hpAnterior = this.HPAtual;
            HPAtual -= dano;
            // Console.WriteLine($"{this.Nome} acabou de levar {dano} de dano.\n{hpAnterior} - {dano}\nHP: {this.HPAtual} restante");
        }
    }
}