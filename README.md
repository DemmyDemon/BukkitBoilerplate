BOILERPLATE
===========

This is my bukkit plugin boilerplate code.  
I kept doing the same thing over and over in different plugins, so I realized I might as well just do a boilerplate lib.

Right now I'm including .class files built from this in every .jar to avoid dependancy-libs having to be distributed, but due to how the class loader works that might not be a good idea.  
I mean... I update the boilerplate and have to recompile and distribute updated versions of ALL plugins, or it might semi-randomly give different results because the wrong version of the libs was used...

Oh well.  I'll get around to solving that later, I guess.
