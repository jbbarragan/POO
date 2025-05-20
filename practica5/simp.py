from sympy import symbols, Or, And, Not, simplify_logic

def parse_boolean_expression(expression: str):
    # Definir las variables booleanas
    A, B, C, D = symbols('A B C D')
    
    # Diccionario de reemplazo para manejar NOT correctamente
    replacements = {"A'": "Not(A)", "B'": "Not(B)", "C'": "Not(C)", "D'": "Not(D)"}
    
    # Reemplazar términos NOT y manejar OR correctamente
    for key, value in replacements.items():
        expression = expression.replace(key, value)
    
    # Reemplazar + por |
    expression = expression.replace("+", " | ")
    
    # Convertir términos AND correctamente
    terms = expression.split(" | ")
    processed_terms = []
    for term in terms:
        term = term.replace(" ", "")  # Eliminar espacios
        and_term = " & ".join(term)  # Convertir concatenaciones en AND
        processed_terms.append(f'({and_term})')
    
    # Unir todo con OR
    boolean_expr = " | ".join(processed_terms)
    
    # Evaluar la expresión booleana con SymPy
    return eval(boolean_expr, {"A": A, "B": B, "C": C, "D": D, "And": And, "Or": Or, "Not": Not})

# Expresión original
expression = "D'C'B'A'+D'C'B'A+D'C'BA'+D'C'BA+D'CB'A'+D'CB'A+D'CBA'+0+0+0+0+0+0+0+0+DCBA"
boolean_expr = parse_boolean_expression(expression)

# Simplificar la expresión
simplified_expr = simplify_logic(boolean_expr, form='dnf')
print("Expresión simplificada:", simplified_expr)
