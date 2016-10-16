/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt9;

/**
 *
 * @author JoiceAndrea
 */
public class Palabras implements Comparable<Palabras>{
    
	private String word;
	private String type;
	
	// Constructor, inicializa la palabra con su tipo
	public Palabras(String word, String type)
	{
		this.word=word;
		this.type=type;
	}
	
	public Palabras()
	{
		this.word= "";
		this.type="";
	}
	
	// Comparadores, solo importa comparar la palabra, no el tipo.
	public int compareTo(Palabras o)
	{
		return this.word.compareTo(o.getWord());
	}
	
	public boolean equals(Object obj)
	{
		return (obj instanceof Palabras && getWord().equals(((Palabras)obj).getWord()));
	}
	
	// Métodos de acceso..
	public void setWord(String word)
	{
		this.word=word;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public String getWord()
	{
		return word;
	}
	
	public String getType()
	{
		return type;
	}
	
}
