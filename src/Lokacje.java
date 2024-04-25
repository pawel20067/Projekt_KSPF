class Lokacje {
    private String nazwa;
    Lokacje[] przejscia = new Lokacje[4];

    public Lokacje(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return this.nazwa;
    }

    public void dodajPrzejscie(Lokacje polnoc, Lokacje poludnie, Lokacje wschod, Lokacje zachod) {
        przejscia[0] = polnoc;
        przejscia[1] = poludnie;
        przejscia[2] = wschod;
        przejscia[3] = zachod;
    }

    public String wypiszPrzejscia() {
        StringBuilder sb = new StringBuilder();
        if (przejscia[0] != null) sb.append("N - ").append(przejscia[0].getNazwa()).append("\n");
        if (przejscia[1] != null) sb.append("S - ").append(przejscia[1].getNazwa()).append("\n");
        if (przejscia[2] != null) sb.append("E - ").append(przejscia[2].getNazwa()).append("\n");
        if (przejscia[3] != null) sb.append("W - ").append(przejscia[3].getNazwa()).append("\n");
        return sb.toString();
    }
}