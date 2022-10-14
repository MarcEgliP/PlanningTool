package com.planningtool.egli.controller.helper;

public class UrlLibrary {

    private UrlLibrary() {}

    public static final String GET_ANSPRECHSPERSONEN = "/ansprechspersonen";
    public static final String GET_ANSPRECHSPERSON = "/ansprechsperson/{ansprechspersonID}";
    public static final String DELETE_ANSPRESCHSPERSON = "/ansprechsperson/{ansprechspersonID}";
    public static final String SAVE_ANSPRESCHSPERSON = "/ansprechsperson";

    public static final String GET_KOMMENTARE = "/kommentare";
    public static final String GET_KOMMENTAR = "/kommentar/{kommentarID}";
    public static final String DELETE_KOMMENTAR = "/kommentar/{kommentarID}";
    public static final String SAVE_KOMMENTAR = "/kommentar";

    public static final String GET_KUNDEN = "/kunden";
    public static final String GET_KUNDE = "/kunde/{kundenID}";
    public static final String DELETE_KUNDE = "/kunde/{kundenID}";
    public static final String SAVE_KUNDE = "/kunde";

    public static final String GET_MITARBEITER = "/mitarbeiter";
    public static final String GET_MITARBEITER_SPECIFIC = "/mitarbeiter/{mitarbeiterID}";
    public static final String DELETE_MITARBEITER = "/mitarbeiter/{mitarbeiterID}";
    public static final String SAVE_MITARBEITER = "/mitarbeiter";

    public static final String GET_PERSONEN = "/personen";
    public static final String GET_PERSON = "/personen/{personID}";
    public static final String DELETE_PERSON = "/person/{personID}";
    public static final String SAVE_PERSON = "/person";

    public static final String GET_PHASEN = "/phasen";
    public static final String GET_PHASE = "/phase/{phaseID}";
    public static final String DELETE_PHASE = "/phase/{phaseID}";
    public static final String SAVE_PHASE = "/phase";

    public static final String GET_PHASEN_MITARBEITER = "/phasen-mitarbeiter";
    public static final String GET_PHASE_MITARBEITER = "/phase-mitarbeiter/{phaseMitarbeiterID}";
    public static final String DELETE_PHASE_MITARBEITER = "/phase-mitarbeiter/{phaseMitarbeiterID}";
    public static final String SAVE_PHASE_MITARBEITER = "/phase-mitarbeiter";

    public static final String GET_PHASEN_PROJEKTE = "/phasen-projekte";
    public static final String GET_PHASE_PROJEKT = "/phase-projekt/{phaseProjektID}";
    public static final String DELETE_PHASE_PROJEKT = "/phase-projekt/{phaseProjektID}";
    public static final String SAVE_PHASE_PROJEKT = "/phase-projekt";

    public static final String GET_PLANUNGEN = "/planungen";
    public static final String GET_PLANUNG = "/planung/{planungID}";
    public static final String DELETE_PLANUNG = "/planung/{planungID}";
    public static final String SAVE_PLANUNG = "/planung";

    public static final String GET_PROJEKTE = "/projekte";
    public static final String GET_PROJEKT = "/projekt/{projektID}";
    public static final String DELETE_PROJEKT = "/projekt/{projektID}";
    public static final String SAVE_PROJEKT = "/projekt";

    public static final String GET_PROJEKTE_MITARBEITER = "/projekte-mitarbeiter";
    public static final String GET_PROJEKT_MITARBEITER = "/projekt-mitarbeiter/{projektMitarbeiterID}";
    public static final String DELETE_PROJEKT_MITARBEITER = "/projekt-mitarbeiter/{projektMitarbeiterID}";
    public static final String SAVE_PROJEKT_MITARBEITER = "/projekt-mitarbeiter";

    public static final String GET_STATUS = "/status";
    public static final String GET_STATUS_SPECIFIC = "/status/{statusID}";
    public static final String DELETE_STATUS = "/status/{statusID}";
    public static final String SAVE_STATUS = "/status";

    public static final String GET_STATUS_MITARBEITER = "/status-mitarbeiter";
    public static final String GET_STATUS_MITARBEITER_SPECIFIC = "/status-mitarbeiter/{statusMitarbeiterID}";
    public static final String DELETE_STATUS_MITARBEITER = "/status-mitarbeiter/{statusMitarbeiterID}";
    public static final String SAVE_STATUS_MITARBEITER = "/status-mitarbeiter";

    public static final String GET_TICKETS = "/ticket";
    public static final String GET_TICKET_SPECIFIC = "/ticket/{ticketID}";
    public static final String DELETE_TICKET = "/ticket/{ticketID}";
    public static final String SAVE_TICKET = "/ticket";
}