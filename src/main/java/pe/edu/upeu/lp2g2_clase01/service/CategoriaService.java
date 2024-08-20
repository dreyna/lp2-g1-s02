package pe.edu.upeu.lp2g2_clase01.service;

import java.util.List;

import pe.edu.upeu.lp2g2_clase01.entity.Categoria;

public interface CategoriaService {
	public Categoria create(Categoria c);
	public Categoria update(Categoria c);
	public void delete(Long id);
	Categoria read(Long id);
	List<Categoria> readAll();
}
