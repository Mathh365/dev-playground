using AllieEntities;
using HostileEntities;
Console.Clear();

Inimigo monstro1 = new("monstro1", 120);
Torre torre1 = new(1);
Torre torre2 = new(2);
Torre torre3 = new(3);
// Console.WriteLine(torre1.info());
// Console.WriteLine(torre2.info());
// Console.WriteLine(torre3.info());

torre3.DoDamage(monstro1);
// torre3.DoDamage(monstro1);
Console.WriteLine(monstro1.Info());

// torre3.DoDamage(monstro1);
// Console.WriteLine(monstro1.Info());