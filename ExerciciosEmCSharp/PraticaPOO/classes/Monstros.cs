namespace HostileEntities
{
    public class Inimigo
    {
        private bool isDead = false;
        public string? Nome {get; set;}
        public int HPTotal { get; set; } = 100;
        public int Velocidade {get; set;}
//----------------------------------------------------------
        private double _HPAtual = 100;
        public double HPAtual
        {
            get { return _HPAtual; }
            set {
                    if (isDead) Console.WriteLine("Este monstro ja esta morto, ataque outro");
                    else if (value <= 0)
                    {
                        Console.WriteLine($"O HP do {this.Nome} chegou a 0, {this.Nome} foi eliminado com sucesso\n");
                        this._HPAtual = 0;
                        this.isDead = true;
                    }
                    else
                    {
                        _HPAtual = value;
                    } 
                }
        }
//----------------------------------------------------------

        public Inimigo (string nome, int velocidade)
        {
            this.Nome = nome;
            this.Velocidade = velocidade;
        }

        public string Info()
        {
            if (isDead)
            {
                return "Status: MORTO";
            }
            else
            {
                return $"""
                Infos do {this.Nome}
                -----------------------------------
                Nome do Inimigo: {this.Nome}
                HP: {this.HPAtual} / {this.HPTotal}
                Velocidade: {this.Velocidade}
                -----------------------------------
                """;
            }           
        }

        public void TakeDamage(double dano)
        {
            if (_HPAtual <= 0)
            {
                Console.WriteLine("Este monstro ja esta morto, ataque outro");
            }
            else
            {
                this.HPAtual -= dano;
            }
        }
    }
}