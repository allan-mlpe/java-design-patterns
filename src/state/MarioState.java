package state;

public interface MarioState {

    MarioState pegarCogumelo() throws MarioMortoException;

    MarioState pegarFlor() throws MarioMortoException;

    MarioState pegarPena() throws MarioMortoException;

    MarioState levarDano() throws MarioMortoException;
}
