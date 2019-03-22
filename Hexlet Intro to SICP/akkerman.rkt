(define (A x y)
    (define (a x y)
        (A x (- y 1)))

    (cond ((= y 0) 0)
          ((= x 0) (* 2 y))
          ((= y 1) 2)
    (else (A (- x 1) (a x y)))))
