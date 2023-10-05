public interface UsuarioAutenticavel {
    Boolean autenticacao(String senha);
    
    void logoff();
}
