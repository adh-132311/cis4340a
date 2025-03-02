
private void writeObject(final ObjectOutputStream stream)
    throws IOException {
  stream.defaultWriteObject();
}
 
private void readObject(final ObjectInputStream stream)
    throws IOException, ClassNotFoundException {
  stream.defaultReadObject();
}
