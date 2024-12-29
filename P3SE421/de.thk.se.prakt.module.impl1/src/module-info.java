module de.thk.se.prakt.module.impl1 {

    requires de.thk.se.prakt.module.selectinterface;


    provides de.thk.se.prakt.module.selectinterface.SelectArray
            with de.thk.se.prakt.module.impl1.Impl1g;
}