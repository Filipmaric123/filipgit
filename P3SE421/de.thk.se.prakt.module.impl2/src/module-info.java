module de.thk.se.prakt.module.impl2 {
    requires de.thk.se.prakt.module.selectinterface;


    provides de.thk.se.prakt.module.selectinterface.SelectArray
            with de.thk.se.prakt.module.impl2.Impl2u;

}