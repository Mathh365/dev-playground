using HostileEntities;

namespace AllieEntities
{
    class Torre
    {
        public int ATK {get; private set;} = 150;
        public int VelocidadeDeAtaque {get; } = 2; //SPS (Shoot per seccond)
        public double Escalonamento {get; private set;} = 30;
        private double DanoDoTiro {get; set;} // ATK * (Escalonamento / 100)
        public double DPS {get; set;} // 2 * ATK

        public Torre(string TipoDeTorre)
        {
            switch (TipoDeTorre.ToLower())
            {
                case "basica":
                    this.ATK = 50;
                    this.VelocidadeDeAtaque = 2;
                    break;
                case "media":
                    this.ATK = 70;
                    this.VelocidadeDeAtaque = 4;
                    break;
                default:
                break;
            }

            this.DanoDoTiro = this.ATK * (this.Escalonamento / 100);
            this.DPS = this.VelocidadeDeAtaque * this.DanoDoTiro;
        }

        public string info()
        {
            return $"""
            Informaçoes da torre
            --------------------
            Ataque: {this.ATK}
            Velocidade de ataque: {this.VelocidadeDeAtaque} SPS (Shoots per Seccond)
            Escalonamento: {this.Escalonamento} %
            Dano por tiro: {this.DanoDoTiro.ToString("N0")}

            DPS TOTAL: {this.DPS}

            """;
        }

        public void DoDamage(Inimigo inimigo)
        {
            inimigo.TakeDamage(this.DanoDoTiro);
        }
    }
}