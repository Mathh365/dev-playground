using AllieEntities;
using HostileEntities;
Console.Clear();

Inimigo bixo = new("Cthullu", 100);
Torre torre1 = new("media");

Console.WriteLine(torre1.info());
Console.WriteLine(bixo.Info());

torre1.DoDamage(bixo);

Console.WriteLine(bixo.Info());

